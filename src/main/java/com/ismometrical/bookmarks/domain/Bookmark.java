package com.ismometrical.bookmarks.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.Instant;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="bookmarks")
class Bookmark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String url;

    @Column(name="created_at",nullable = false,updatable = false)
    @CreatedDate
    private Instant createdAt;
    @Column(name="updated_at", insertable = false)
    private Instant updatedAt;

    public Bookmark(String title, String url) {
        this.title = title;
        this.url = url;
    }
}
