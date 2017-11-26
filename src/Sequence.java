public interface Sequence {
    String emit();
    boolean encapsulate(String word);
    int isActive();
    void deactivate();
    void activate();

}
