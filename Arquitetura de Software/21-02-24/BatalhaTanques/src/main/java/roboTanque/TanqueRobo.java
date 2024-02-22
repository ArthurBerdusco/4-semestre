package roboTanque;

public class TanqueRobo implements Posicao, Canhao, Cor {

    private int x;
    private int y;
    private String nome;
    private CoresRGB corTanque;
    private CoresRGB corCanhao;

    public TanqueRobo(int x, int y, String nome, CoresRGB corTanque, CoresRGB corCanhao) {
        this.x = x;
        this.y = y;
        this.nome = nome;
        this.corTanque = corTanque;
        this.corCanhao = corCanhao;
    }

    public TanqueRobo() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CoresRGB getCorTanque() {
        return corTanque;
    }

    public void setCorTanque(CoresRGB corTanque) {
        this.corTanque = corTanque;
    }

    public CoresRGB getCorCanhao() {
        return corCanhao;
    }

    public void setCorCanhao(CoresRGB corCanhao) {
        this.corCanhao = corCanhao;
    }

    @Override
    public void movSul() {
        y--;
    }

    @Override
    public void movNorte() {
        y++;
    }

    @Override
    public void movLeste() {
        x++;
    }

    @Override
    public void movOeste() {
        x--;
    }

    @Override
    public int retirarPosX() {
        return x;
    }

    @Override
    public int retirarPosY() {
        return y;
    }

    @Override
    public void atirar() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Atirando...");
        }
    }

    @Override
    public void atirar(long cadencia) {
        for (int i = 0; i < 5; i++) {
            esperar(cadencia * 1000);
            System.out.println("Atirando...");
        }
    }

    @Override
    public void atribuirCorTanque(CoresRGB cor) {
        this.corTanque = cor;
    }

    @Override
    public void atribuirCorCanhao(CoresRGB cor) {
        this.corCanhao = cor;
    }

    @Override
    public CoresRGB retirarCorTanque() {
        return corTanque;
    }

    @Override
    public CoresRGB retirarCorCanhao() {
        return corCanhao;
    }

    /**
     * Cria um intervalo de tempo para o método atirar
     * @param cadencia long(milisegundos)
     */
    private void esperar(long cadencia) {
        try {
            
            if(cadencia > 5000){
                throw new IllegalArgumentException("Valor inválido!");
            }
            
            new Thread().sleep(cadencia);
        } catch (InterruptedException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public String toString() {
        return "TanqueRobo{" + "x=" + x + ", y=" + y + ", nome=" + nome + ", corTanque=" + corTanque + ", corCanhao=" + corCanhao + '}';
    }

}
