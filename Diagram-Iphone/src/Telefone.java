public class Telefone {
  private int numero;

  public void fazendoChamada(int numero) {
    System.out.println("Ligar para o numero: " + numero);
  }

  public void cancelandoChamda() {
    System.out.println("Ligação cancelada!");
  }

  public void atendendoLigacao() {
    System.out.println("Ligação aceita!");
  }

  public void ligacaoEmEspera() {
    System.out.println("Ligação em espera!");
  }

  public void retomandoLigacao() {
    System.out.println("Ligação retomada!");
  }

  public void correioVoz() {
    System.out.println("Ouvir correio de voz!");
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

}
