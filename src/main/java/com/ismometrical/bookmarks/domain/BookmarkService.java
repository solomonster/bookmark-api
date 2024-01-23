package com.ismometrical.bookmarks.domain;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BookmarkService {

    private final BookmarkRepository bookmarkRepository;
    BookmarkService(BookmarkRepository bookmarkRepository)
    {
        this.bookmarkRepository = bookmarkRepository;
    }
    

}
