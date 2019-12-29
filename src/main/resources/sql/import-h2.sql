INSERT INTO POST (id,title, body, summary) values (RANDOM_UUID(), 'Post 2', 'Body 2', 'Summary 2');


INSERT INTO POST (id,title, body, summary) values (RANDOM_UUID(), 'Post 3', '<pre><code class="language-java">package com.wp.blog.domain; import com.sun.istack.NotNull; import javax.persistence.Entity; import javax.persistence.Column; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType; import javax.persistence.Id; import javax.validation.constraints.NotEmpty; import java.util.UUID; @Entity public class Post { @Id @GeneratedValue(strategy = GenerationType.AUTO) private UUID id; @NotEmpty private String title; @NotEmpty @Column(columnDefinition="LONGTEXT") private String body; @NotEmpty private String summary; public UUID getId() { return id; } public void setId(UUID id) { this.id = id; } public String getTitle() { return title; } public void setTitle(String title) { this.title = title; } public String getBody() { return body; } public void setBody(String body) { this.body = body; } public String getSummary() { return summary; } public void setSummary(String summary) { this.summary = summary; } } </code></pre>', 'Summary 3');


INSERT INTO POST (id,title, body, summary) values (RANDOM_UUID(), 'Post 4', '
<pre><code class="language-java">package com.wp.blog.domain;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.util.UUID;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotEmpty
    private String title;

    @NotEmpty
    @Column(columnDefinition="LONGTEXT")
    private String body;

    @NotEmpty
    private String summary;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
</code></pre>
', 'Summary 4');



INSERT INTO POST (id,title, body, summary) values (RANDOM_UUID(), 'The best way to prevent JPA and Hibernate performance issues', '
<h2>Introduction</h2><p>In this article, I’m going to present the best way to prevent performance issues when using JPA and Hibernate.</p><p>Many years ago, I used to work as a team leader, and, one day, the General Manager asked me to take a look at a project that was in big trouble.</p><p>The application in question had been developed by a team of software developers for over 9 months, and the client had just tested in a production-like environment.</p><p>The client got very upset when realizing that the application was barely crawling. For instance, I was told that a query had been running for 10 hours without showing any signs of stopping.</p><p>After analyzing the project, I identified many areas that could have been improved, and that’s how my passion for high-performance data access was born.</p>
', 'In this article, I’m going to present the best way to prevent performance issues when using JPA and Hibernate.');

