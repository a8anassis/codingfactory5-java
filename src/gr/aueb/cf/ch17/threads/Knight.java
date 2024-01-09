package gr.aueb.cf.ch17.threads;

public class Knight implements IKnight {

    @Override
    public void embarkOnMission(IMission mission) {
        mission.embark();
    }
}
