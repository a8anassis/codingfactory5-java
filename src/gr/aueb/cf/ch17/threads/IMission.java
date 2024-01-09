package gr.aueb.cf.ch17.threads;

public interface IMission {
    MissionStatus getStatus();
    void setStatus(MissionStatus status);
    void embark();
}
