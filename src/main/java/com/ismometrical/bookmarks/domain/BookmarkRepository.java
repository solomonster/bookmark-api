package com.ismometrical.bookmarks.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

interface BookmarkRepository extends JpaRepository<Bookmark,Long> {

    @Query("""
               SELECT
                new com.ismometrical.bookmarks.domain.BookmarkDTO(b.id, b.title, b.url, b.createdAt)
               FROM Bookmark b
            """)
    Page<BookmarkDTO> findBookmarks(Pageable pageable);

}
