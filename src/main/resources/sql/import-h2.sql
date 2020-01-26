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

INSERT INTO POST (id,title, body, summary) values (
RANDOM_UUID(),
'Short Story',
'<h2>Bank Robbery</h2><p>On <strong>February 15, 2019, Detectives with the Montgomery County Sheriffs Office Homicide </strong>– Violent Crimes Unit, along with the Special Agents with the Federal Bureau of Investigation, arrested Jasmin Nicole Cruz (DOB: 09/04/93) for the robbery of the Chase Bank located at 8201 Kuykendahl Rd, The Woodlands, TX on February 13, 2019.</p><p>Cruz was arrested at her apartment, 3600 College Park Dr, The Woodlands, TX without incident. During the investigation. Detectives also learned Cruz’s girlfriend, Victoria L Mclean (DOB: 02/09/90) (the bank teller that was robbed), was arrested and charged with felony theft in connection with the robbery.</p><p><i><strong>During an interview with Detectives, Cruz confessed to her role in the robbery</strong></i>, and led investigators to the remainder of the cash taken. The investigation is still ongoing. If you have any information regarding this incident, please contact Montgomery County Sheriffs Office at 936-760-5800, the FBI, or Crime Stoppers at 1-800-392-STOP (7867) and refer to case #19A052019.</p><p>&nbsp;</p><pre><code class="language-java">package com.reljicd.controller;

 import com.reljicd.model.Post;
 import com.reljicd.model.User;
 import com.reljicd.service.PostService;
 import com.reljicd.service.UserService;
 import com.reljicd.util.Pager;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.data.domain.Page;
 import org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.PathVariable;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RequestMethod;
 import org.springframework.web.bind.annotation.RequestParam;

 import java.util.Optional;

 @Controller
 public class BlogController {

     private final UserService userService;

     private final PostService postService;

     @Autowired
     public BlogController(UserService userService, PostService postService) {
         this.userService = userService;
         this.postService = postService;
     }

     @RequestMapping(value = "/blog/{username}", method = RequestMethod.GET)
     public String blogForUsername(@PathVariable String username,
                                   @RequestParam(defaultValue = "0") int page,
                                   Model model) {

         Optional&lt;User&gt; optionalUser = userService.findByUsername(username);

         if (optionalUser.isPresent()) {
             User user = optionalUser.get();
             Page&lt;Post&gt; posts = postService.findByUserOrderedByDatePageable(user, page);
             Pager pager = new Pager(posts);

             model.addAttribute("pager", pager);
             model.addAttribute("user", user);

             return "/posts";

         } else {
             return "/error";
         }
     }
 }</code></pre><pre><code class="language-c">#include &lt;stdio.h&gt;

 int main() {
   int x, y;
   x = 128;
   y = x &gt;&gt; 6;
   printf("y is now %d.\n", y);
 }</code></pre>',
'This is summary of a post about bank robbery and programming.');