package net.flytre.hplus;

import net.fabricmc.api.ClientModInitializer;

public class ClientInitializer implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ClientRegistry.init();
    }
}
