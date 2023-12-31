package servicio;

import dominio.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class ServicioPeliculasLista implements IServicioPeliculas {

    private final List<Pelicula> peliculas;

    public ServicioPeliculasLista(){
        this.peliculas = new ArrayList<>();
    }

    @Override
    public void listarPeliculas() {
        peliculas.forEach(System.out::println);
    }

    @Override
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
        System.out.println("Se agrego la pelicula: " + pelicula);
    }

    @Override
    public void buscarPelicula(Pelicula pelicula) {
        //regresa el indice de la pelicula encontrada en la lista
        int i = peliculas.indexOf(pelicula);
        if (i == -1)
            System.out.println("No se encontro la pelicula: " + pelicula);
        System.out.println("Pelicula encontrada en el indice: " + i);
    }

    public static void main(String[] args) {
        //creamos objetos tipo pelicula
        var pelicula1 = new Pelicula("Batman");
        var pelicula2 = new Pelicula("Superman");
        //creamos el servicio
        IServicioPeliculas servicioPeliculas = new ServicioPeliculasLista();
        //agregamos las peliculas a la lista
        servicioPeliculas.agregarPelicula(pelicula1);
        servicioPeliculas.agregarPelicula(pelicula2);
        //listamos las peliculas
        servicioPeliculas.listarPeliculas();
        //buscamos una pelicula
        servicioPeliculas.buscarPelicula(pelicula2);
    }
}
