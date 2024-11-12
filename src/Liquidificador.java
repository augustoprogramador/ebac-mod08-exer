public class Liquidificador {

    private int voltagem;
    private double capacidadeLitros;
    private String cor;
    private String marca;

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public double getCapacidadeLitros() {
        return capacidadeLitros;
    }

    public void setCapacidadeLitros(double capacidadeLitros) {
        this.capacidadeLitros = capacidadeLitros;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Esse método é utilizado para ativar as lâminas do liquidificador.
     *
     * @author Augusto Camargo
     *
     * @param alimento
     * Alimento que será triturado.
     *
     * @return String
     */
    public String triturarAlimento(String alimento) {
        return captalize(alimento) + " foi triturado com sucesso!";
    }

    private String captalize(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
}
