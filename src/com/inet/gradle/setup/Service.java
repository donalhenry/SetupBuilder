package com.inet.gradle.setup;

/**
 * Definition of a service to be installed on the target system.
 */
public class Service extends Application {
    private boolean startOnBoot = true;
    private String  startArguments;

    /**
     * Create a new Service
     * @param setup current SetupBuilder
     */
    public Service( SetupBuilder setup ) {
        super( setup );
    }

    /**
     * Get the baseName for the service
     * @return the base name
     */
    public String getBaseName() {
        if( !super.getBaseName().equals( getName() ) ) {
            return super.getBaseName();
        }
        return getName() + " Service";
    }

    /**
     * Returns a boolean flag indicating whether the service is started when the system is booted.
     * @return boolean flag indicating whether the service is started when the system is booted
     */
    public boolean isStartOnBoot() {
        return startOnBoot;
    }

    /**
     * Sets a boolean flag indicating whether the service is started when the system is booted.
     * @param startOnBoot boolean flag indicating whether the service is started when the system is booted
     */
    public void setStartOnBoot( boolean startOnBoot ) {
        this.startOnBoot = startOnBoot;
    }

    /**
     * Returns the command-line arguments for starting the service.
     * @return the command-line arguments for starting the service
     */
    public String getStartArguments() {
        if (startArguments == null) {
            return "";
        }
        return startArguments;
    }

    /**
     * Sets the command-line arguments for starting the service.
     * @param startArguments the command-line arguments for starting the service
     */
    public void setStartArguments( String startArguments ) {
        this.startArguments = startArguments;
    }
}
