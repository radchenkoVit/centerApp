package mocks;

import model.VisaApplication;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class AppDBMock {
    private Map<UUID, VisaApplication> visas = new HashMap<UUID, VisaApplication>();
}
