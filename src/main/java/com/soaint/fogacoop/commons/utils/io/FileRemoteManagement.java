package com.soaint.fogacoop.commons.utils.io;

public class FileRemoteManagement {
    /*
    private static final String TEMP_FOLDER_NAME = "host.folder";
    private static final Logger LOGGER = LogManager.getLogger(FileRemoteManagement.class);
    private final Session session;

    public FileRemoteManagement() {
        this.session = null;
    }

    public void uploadFileRemoteServer(final String filepath, String uuid) {

        try {
            ChannelSftp sftpChannel = SessionFtpBuilder.getInstance().createClient();
            sftpChannel.put(filepath, AlfrescoBundleUtil.getProperty(TEMP_FOLDER_NAME)
                    .concat("/")
                    .concat(uuid)
                    .concat("/"));
            sftpChannel.disconnect();
            SessionFtpBuilder.getInstance().destroyClient();
        } catch (JSchException e) {
            e.printStackTrace();
        } catch (SftpException e) {
            e.printStackTrace();
        }
    }

    public final String createFolderRemoteServer(final String uuidFolderTemp) {
        try {
            final String tempFolderImport = AlfrescoBundleUtil.getProperty(TEMP_FOLDER_NAME).concat(uuidFolderTemp);
            ChannelSftp sftpClient = SessionFtpBuilder.getInstance().createClient();
            sftpClient.mkdir(tempFolderImport);
            //sftpChannel.chmod(777, tempFolderImport);
            SessionFtpBuilder.getInstance().destroyClient();
            LOGGER.info("Carpeta Creada"+tempFolderImport);
            return tempFolderImport;
        } catch (Exception ex) {
            LOGGER.info("Error Creando Folder Remoto Por: "+ex.getMessage());
            ex.printStackTrace();
            return null;
        }
    }
    */
}
