package com.ismometrical.bookmarks.domain;

import org.springframework.data.jpa.repository.JpaRepository;

interface BookmarkRepository extends JpaRepository<Bookmark,Long> {

}
