package gr.aueb.cf.ch20.lambdas;

@FunctionalInterface
public interface ITeacherIDFilter {
    boolean filterId(Teacher teacher);
}
