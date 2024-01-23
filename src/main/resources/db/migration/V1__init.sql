create table bookmarks
(
  id         bigserial primary key,
  title      varchar not null,
  url        varchar not null,
  created_at timestamp,
  updated_at timestamp
);

INSERT INTO bookmarks(title, url, created_at) VALUES
('Array interview questions','https://interviewing.io/arrays-interview-questions', CURRENT_TIMESTAMP),
('Introduction to project Lombok','https://www.baeldung.com/intro-to-project-lombok', CURRENT_TIMESTAMP),
('Bookmark API','https://github.com/solomonster/bookmark-api', CURRENT_TIMESTAMP),
('JPA Entities','https://www.baeldung.com/jpa-entities', CURRENT_TIMESTAMP)
;