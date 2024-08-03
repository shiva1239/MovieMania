package dev.shiva.movieist.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    public void testConnection() {
        try {
            List<Movie> movies = repository.findAll();
            System.out.println("Connection test successful. Found " + movies.size() + " movies.");
        } catch (Exception e) {
            System.err.println("Connection test failed: " + e.getMessage());
        }
    }
    public List<Movie> findAllMovies() {
        return repository.findAll();
    }
    public Optional<Movie> findMovieByImdbId(String imdbId) {
        return repository.findMovieByImdbId(imdbId);
    }
}
