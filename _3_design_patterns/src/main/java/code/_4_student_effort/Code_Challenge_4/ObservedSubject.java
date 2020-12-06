package code._4_student_effort.Code_Challenge_4;

public interface ObservedSubject {

    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObservers(String message);
}
