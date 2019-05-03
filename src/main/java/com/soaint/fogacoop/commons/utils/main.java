package com.soaint.fogacoop.commons.utils;


public class main {

/*

    public List<Metadatos> existFileMigration(final List<Metadatos> metadatos) throws BusinessException {
        final List<Metadatos> filesImport = metadatos;

        for (Iterator<Metadatos> iterator = filesImport.iterator(); iterator.hasNext(); ) {
            Metadatos value = iterator.next();
            if (!new File(value.getRutaArchivo()).exists()) {
                iterator.remove();
            }
        }
        return filesImport;
    }

    public static void main(String[] args) throws ParseException, BusinessException {
        System.out.println("Contenido JSON: "+ JSONUtil.marshal(EjecucionDTORequest.builder()
                .idRegistro(11)
                .mensajeEstadoProceso("mensajeEstadoProceso")
                .uuid("9090909-90890809-8980980")
                .estadoProceso(new EstadoDTOResponse()).build()));


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd'T'HH:mm:ss.SSSZ");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println("Antes de la conversion: " +GregorianCalendar.getInstance().getTime().toString());
        System.out.println(sdf.format(new Date()));
        System.out.println(GenerarConsecutivoUtil.generarCosecutivo());

        List<Metadatos> metadatos = new ArrayList<>();
        Metadatos metadato = Metadatos.builder()
                .idregistro(1)
                .numeroRadicado("100")
                .numeroRadicacion(1000)
                .anioRadicacion(20)
                .consecutivoRadicacion(1)
                .rutaArchivo("C:\\Users\\User\\Desktop\\IMG_1967.jpg")
                .estadoProceso(0)
                .uuid("uuuid-prueba")
                .build();
        Metadatos metadato2 = Metadatos.builder()
                .idregistro(2)
                .numeroRadicado("100")
                .numeroRadicacion(1000)
                .anioRadicacion(20)
                .consecutivoRadicacion(1)
                .rutaArchivo("C:\\Users\\User\\Desktop\\IMG_19.jpg")
                .estadoProceso(0)
                .uuid("uuuid-prueba")
                .build();
        Metadatos metadato3 = Metadatos.builder()
                .idregistro(3)
                .numeroRadicado("100")
                .numeroRadicacion(1000)
                .anioRadicacion(20)
                .consecutivoRadicacion(1)
                .rutaArchivo("C:\\Users\\User\\Desktop\\IMG_1967.jpg")
                .estadoProceso(0)
                .uuid("uuuid-prueba")
                .build();
        metadatos.add(metadato);
        metadatos.add(metadato2);
        metadatos.add(metadato3);


        main m = new main();
        List<Metadatos> existenciaVerificada =  m.existFileMigration(metadatos);
        for (Metadatos metadatos1 : existenciaVerificada) {
            System.out.println(metadatos1.toString());
        }

        System.out.println("Marshall AplicacionEstado: " + JSONUtil.marshal(new AplicacionEstado()));


        // System.out.println("OBject request: "+ JSONUtil.marshal(new RegistrarEjecucionDTORequest(1)));
    }
    */
}
