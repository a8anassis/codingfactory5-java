package gr.aueb.cf.ch17.threads;

@FunctionalInterface
public interface IKnight {
    IMission[] missions = {
            new KillTheDragonMission(),
            new SaveThePrincess(),
            new KillTheDragonMission()
    };

    void embarkOnMission(IMission mission);
}
