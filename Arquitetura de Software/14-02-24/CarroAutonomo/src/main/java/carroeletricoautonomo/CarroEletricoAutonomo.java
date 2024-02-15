package carroeletricoautonomo;

public interface CarroEletricoAutonomo extends Bateria, VeiculoAutonomo{
    public void monitorarBateria();
    public void definirRota(String origem, String destino);
}
