package lista.classes;

public class NotaEstudante {
    public double notaLaboratorio;
    public double notaSemestral;
    public double notaExameFinal;

    public NotaEstudante(double notaLaboratorio, double notaSemestral, double notaExameFinal) {
        this.notaLaboratorio = notaLaboratorio;
        this.notaSemestral = notaSemestral;
        this.notaExameFinal = notaExameFinal;
    }

    public double calcularNotaFinal() {
<<<<<<< HEAD
        return (notaLaboratorio * 2 + notaSemestral * 3 + notaExameFinal * 5) / 10;
=======
        double notaFinal = (notaLaboratorio * 2 + notaSemestral * 3 + notaExameFinal * 5) / 10;
        return notaFinal;
>>>>>>> 988b6d6475e84bd25e13a4146da43022e72b0728
    }
}