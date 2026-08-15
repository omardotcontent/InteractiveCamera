package omar.projects.interactivecamera.VynAPI;

import me.abdelaziz.runtime.Environment;
import me.abdelaziz.util.NativeBinder;
import studio.meraki.vynapi.model.VynAddon;
import java.util.function.Consumer;

public class ICVynAddon extends VynAddon {

    @Override
    public Consumer<Environment> onEnable() {

        return null;
    }
}
