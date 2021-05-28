package com.shakhzod.blog.repo;

import com.shakhzod.blog.models.Post;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class PostRepositoryTest {

    @Autowired
    private PostRepository postRepository;

    @AfterEach
    void tearDown() {
        postRepository.deleteAll();
    }

    @Test
    void itShouldCheckExistenceOfAnons()
    {
        //given
        String anons = "YandexTaxi";
        Post post2 = new Post("Yandex",anons,"Getting expensive");
        postRepository.save(post2);

        //when
        Boolean expected = postRepository.existsByAnons(anons);
        //then
        assertThat(expected).isTrue();
    }

    @Test
    void itShouldCheckNotExistenceOfAnons()
    {
        //given
        String anons = "YandexTaxi";

        //when
        Boolean expected = postRepository.existsByAnons(anons);
        //then
        assertThat(expected).isFalse();
    }

}