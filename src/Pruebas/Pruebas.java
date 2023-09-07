package Pruebas;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Pruebas {
    public static void main(String[] args) {
        // Ruta relativa desde la ubicación de Main al archivo config.properties
        String configPath = "hola.properties";

        // Carga el archivo de propiedades
        try (InputStream input = Pruebas.class.getResourceAsStream(configPath)) {
            if (input == null) {
                System.err.println("No se pudo cargar el archivo de configuración.");
                return;
            }

            Properties properties = new Properties();
            properties.load(input);

            // Accede a las propiedades del archivo
            String dbHost = properties.getProperty("db.host");
            String dbPort = properties.getProperty("db.port");
            String dbUsername = properties.getProperty("db.username");
            String dbPassword = properties.getProperty("db.password");
            String dbName = properties.getProperty("db.database_name");

            // Haz lo que necesites con las propiedades
            System.out.println("Database Host: " + dbHost);
            System.out.println("Database Port: " + dbPort);
            System.out.println("Database Username: " + dbUsername);
            System.out.println("Database Password: " + dbPassword);
            System.out.println("Database Name: " + dbName);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}