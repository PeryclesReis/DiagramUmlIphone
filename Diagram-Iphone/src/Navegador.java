public class Navegador {
  private String url;

  public void abrindoNovaAba() {
    System.out.println("Abrindo nova aba no navegador!");
  }

  public void fechandoAba() {
    System.out.println("Fechando aba no navegador!");
  }

  public void exibindoPaginas(String url) {
    this.setUrl(url);
    System.out.println("Abrindo pagina da web!");
  }

  public void atualizandoPAgina() {
    System.out.println("Atualizando pagina da web");
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
