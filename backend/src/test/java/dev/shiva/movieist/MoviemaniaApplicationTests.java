package dev.shiva.movieist;

import dev.shiva.movieist.movies.Movie;
import dev.shiva.movieist.movies.MovieController;
import dev.shiva.movieist.movies.MovieService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@SpringBootTest
class MovieistApplicationTests {

    @Autowired
    private MovieController movieController;

    @MockBean
    private MovieService movieService;

    @Test
    void contextLoads() {
        assertThat(movieController).isNotNull();
    }

    @Test
    void testGetMovies() {
        // Arrange
        Movie movie1 = new Movie("tt0111161", "The Shawshank Redemption", "1994", "link", "poster", Arrays.asList("backdrop1", "backdrop2"), Arrays.asList("Drama"));
        Movie movie2 = new Movie("tt0068646", "The Godfather", "1972", "link", "poster", Arrays.asList("backdrop1", "backdrop2"), Arrays.asList("Crime", "Drama"));
        List<Movie> movies = Arrays.asList(movie1, movie2);
        given(movieService.findAllMovies()).willReturn(movies);

        // Act
        ResponseEntity<List<Movie>> response = movieController.getMovies();

        // Assert
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isNotNull();
        assertThat(response.getBody().size()).isEqualTo(2);
        assertThat(response.getBody().get(0).getTitle()).isEqualTo("The Shawshank Redemption");
    }

    @Test
    void testGetSingleMovie() {
        // Arrange
        String imdbId = "tt0111161";
        Movie movie = new Movie(imdbId, "The Shawshank Redemption", "1994", "link", "poster", Arrays.asList("backdrop1", "backdrop2"), Arrays.asList("Drama"));
        given(movieService.findMovieByImdbId(imdbId)).willReturn(Optional.of(movie));

        // Act
        ResponseEntity<Movie> response = (ResponseEntity<Movie>) movieController.getSingleMovie(imdbId);

        // Assert
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isNotNull();
        assertThat(response.getBody().getTitle()).isEqualTo("The Shawshank Redemption");
    }

    @Test
    void testGetSingleMovieNotFound() {
        // Arrange
        String imdbId = "tt0111161";
        given(movieService.findMovieByImdbId(imdbId)).willReturn(Optional.empty());

        // Act
        ResponseEntity<Movie> response = (ResponseEntity<Movie>) movieController.getSingleMovie(imdbId);

        // Assert
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
    }
}
