package ru.netology.domain;


        import lombok.AllArgsConstructor;
        import lombok.Data;
        import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class MovieItem {
    private int id;
    private int movieId;
    private String movieName;

    public MovieItem(int i, int i1, String бладшот) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void addMovieItem(int i) {
    }
}