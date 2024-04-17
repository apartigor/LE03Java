package br.edu.up.lista.classes;

public class NotaEstudante {
    private double notaLaboratorio;
    private double notaSemestral;
    private double notaExameFinal;

    public NotaEstudante(double notaLaboratorio, double notaSemestral, double notaExameFinal) {
        this.notaLaboratorio = notaLaboratorio;
        this.notaSemestral = notaSemestral;
        this.notaExameFinal = notaExameFinal;
    }

    public double calcularNotaFinal() {
        return (notaLaboratorio * 2 + notaSemestral * 3 + notaExameFinal * 5) / 10;
    }
}