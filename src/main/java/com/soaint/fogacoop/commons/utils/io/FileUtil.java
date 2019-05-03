package com.soaint.fogacoop.commons.utils.io;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.omg.CORBA.SystemException;

import java.io.*;

//@Resource
public class FileUtil {

    private static final Logger LOGGER = LogManager.getLogger(FileUtil.class);

    /*
    private static final String ALFRESCO_HOST_IP = "alfresco.host";
    private static final String USER_ALFRESCO_SERVER_HOST = "host.user";
    private static final String PASSWORD_ALFRESCO_HOST = "host.password";
    private static final String PROTOCOL = "sftp";
    private static final String TEMP_FOLDER = "host.folder";

    public static void uploadFileServer(final String filepath, final String uuid) throws SystemException {

        try {

            JSch jsch = new JSch();
            System.out.println("SERVER HOST" + AlfrescoBundleUtil.getProperty(USER_ALFRESCO_SERVER_HOST));
            System.out.println("IP HOST" + AlfrescoBundleUtil.getProperty(ALFRESCO_HOST_IP));
            Session session = jsch.getSession(
                    AlfrescoBundleUtil.getProperty(USER_ALFRESCO_SERVER_HOST),
                    AlfrescoBundleUtil.getProperty(ALFRESCO_HOST_IP));
            session.setConfig("StrictHostKeyChecking", "no");
            session.setPassword(AlfrescoBundleUtil.getProperty(PASSWORD_ALFRESCO_HOST));
            session.connect();

            ChannelSftp sftpChannel = (ChannelSftp) session.openChannel(PROTOCOL);
            sftpChannel.connect();

            sftpChannel.put(filepath, AlfrescoBundleUtil.getProperty(TEMP_FOLDER).concat(File.separator).concat(uuid));
            sftpChannel.disconnect();
            session.disconnect();
        } catch (Throwable ex) {
            LOGGER.info("Error subiendo archivo servidor por " + ex.getMessage());
            ex.printStackTrace();
            throw ExceptionBuilder.newBuilder().withCode(CodigoError.FILE_NOT_FOUND_EXCEPTION)
                    .withMessage(MensajeError.ROUTE_NO_FOUND.getName()).buildSystemException();
        }
    }

*/
    public static String moveFile(final String rutaArchivoActual, final String rutaDestino) throws IOException {

        File archivoInicial = new File(rutaArchivoActual);
        LOGGER.info("Create File {} with PATH: {} ", archivoInicial.getName(), rutaArchivoActual);
        //String destinationFilePath = rutaDestino + File.separator + archivoInicial.getName();
        String destinationFilePath = rutaDestino;
        InputStream in = null;
        OutputStream out = null;

        if (archivoInicial.exists()) {
            try {
                LOGGER.info("Create File {} in destintation PATH: {} ", archivoInicial.getName(), rutaDestino);

                in = new FileInputStream(rutaArchivoActual);
                File f = new File(destinationFilePath);
                //URLDecoder.decode(xmlMetadataFile.toURI().toURL().toString(), encode)
                out = new FileOutputStream(f.getAbsoluteFile());

                byte[] buf = new byte[(int) archivoInicial.length()];
                int len;
                while ((len = in.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }
                LOGGER.info("CORRECT: Create File {} in destintation PATH: {} ", archivoInicial.getName(), rutaDestino);
            } catch (NullPointerException | IOException io) {
                LOGGER.error("ERRROR: Create File {} in destintation PATH: {} ", archivoInicial.getName(), rutaDestino);
                return "";
            } finally {
                in.close();
                out.close();
            }
        }

        return destinationFilePath;
    }

    public static File createFolder(String folderName, String folderPath) throws NullPointerException, SystemException {

        final String destinationFolderPath = folderPath + File.separator + folderName + File.separator;

        File folder = new File(destinationFolderPath);
        folder.mkdirs();
        folder.setExecutable(true, false);
        folder.setReadable(true, false);
        folder.setWritable(true, false);
        LOGGER.info("Create Folder {} with PATH: {} ", folder.getName(), destinationFolderPath);
        if (folder.exists()) {

            LOGGER.info("CORRECT: Create Folder {} with PATH: {} ", folder.getName(), destinationFolderPath);
            return folder;
        } else{
            LOGGER.error("ERROR: create Folder with PATH: {}", destinationFolderPath);

        }
        return null;
    }
}
