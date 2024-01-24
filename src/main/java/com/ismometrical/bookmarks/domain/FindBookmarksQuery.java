package com.ismometrical.bookmarks.domain;

public record FindBookmarksQuery(
        int pageNo,
        int pageSize
) {
}
