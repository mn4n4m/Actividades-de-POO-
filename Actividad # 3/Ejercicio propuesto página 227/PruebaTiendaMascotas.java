package TiendaMascotas;

public class PruebaTiendaMascotas {
    public static void main(String[] args) {
        // PERROS
        PerroGrande rex = new PerroGrande("Rex", 5, "Negro y café", 35.5f, true, "Pastor Alemán");
        PerroMediano bella = new PerroMediano("Bella", 3, "Blanco con manchas", 22.0f, false, "Dálmata");
        PerroPequeño coco = new PerroPequeño("Coco", 2, "Marrón", 5.3f, false, "Caniche");

        // GATOS
        GatoSinPelo pelusa = new GatoSinPelo("Pelusa", 4, "Rosado", 50f, 100f, "Esfinge");
        GatoPeloLargo luna = new GatoPeloLargo("Luna", 3, "Blanco", 60f, 120f, "Himalayo");
        GatoPeloCorto tito = new GatoPeloCorto("Tito", 1, "Gris", 45f, 90f, "Británico");

        // IMPRIMIR
        System.out.println("====== 🐕 PERROS ======");
        rex.imprimir();
        System.out.println();
        bella.imprimir();
        System.out.println();
        coco.imprimir();

        System.out.println("\n====== 🐈 GATOS ======");
        pelusa.imprimir();
        System.out.println();
        luna.imprimir();
        System.out.println();
        tito.imprimir();

        // MÉTODOS ESTÁTICOS
        System.out.println("\n====== 🔊 SONIDOS ======");
        Perro.sonido();
        Gato.sonido();
    }
}
