public class ReprodutorMusical {
  private String[] musica;

  public void tocarMusica() {
    System.out.println("Tocando música!");
  }

  public void pausarMusica() {
    System.out.println("Pausando música!");
  }

  public void listandoMusicas() {
    System.out.println("Lista de músicas");
  }

  public void setMusica(String[] musica) {
    this.musica = musica;
  }

  public String[] getMusica() {
    return musica;
  }

}
