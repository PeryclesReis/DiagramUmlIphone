public class IPhone {
  private String cor;
  private String modelo;
  private boolean tela;

  public IPhone() {
    this.tela = false;
  }

  public void ligarTela() {
    this.tela = true;
    System.out.println("Tela ligada com sucesso!");
  }

  public void desligarTela() {
    this.tela = false;
    System.out.println("Tela desligada com sucesso!");
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }
}
