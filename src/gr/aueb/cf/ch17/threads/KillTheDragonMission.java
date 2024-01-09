package gr.aueb.cf.ch17.threads;

public class KillTheDragonMission implements IMission {
    private MissionStatus missionStatus = MissionStatus.NOT_STARTED;

    @Override
    public MissionStatus getStatus() {
        return missionStatus;
    }

    @Override
    public void setStatus(MissionStatus status) {
        this.missionStatus = status;
    }

    @Override
    public void embark() {
        System.out.println("Kill the Dragon");
    }
}
