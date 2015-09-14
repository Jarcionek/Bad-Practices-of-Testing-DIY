package presentation._08;

public class FakeUuidProvider implements UuidProvider {

    @Override
    public String nextUuid() {
        return "12345";
    }

}
