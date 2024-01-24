package com.ismometrical.bookmarks.domain;

import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BookmarkService {

    private final BookmarkRepository bookmarkRepository;
    BookmarkService(BookmarkRepository bookmarkRepository)
    {
        this.bookmarkRepository = bookmarkRepository;
    }
    public PagedResult<BookmarkDTO> findBookmarks(FindBookmarksQuery query) {
        Sort sort = Sort.by(Sort.Direction.DESC, "createdAt");
        //from user POV, page number starts from 1, but for Spring Data JPA page number starts from 0.
        int pageNo = query.pageNo() > 0 ? query.pageNo() - 1 : 0;
        Pageable pageable = PageRequest.of(pageNo, query.pageSize(), sort);
        Page<BookmarkDTO> page = bookmarkRepository.findBookmarks(pageable);
        return new PagedResult<>(
                page.getContent(),
                page.getTotalElements(),
                page.getNumber() + 1, // for user page number starts from 1
                page.getTotalPages(),
                page.isFirst(),
                page.isLast(),
                page.hasNext(),
                page.hasPrevious()
        );
    }

}
