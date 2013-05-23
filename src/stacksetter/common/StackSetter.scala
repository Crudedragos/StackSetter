package stacksetter.common

import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.network.NetworkMod
import cpw.mods.fml.common.Mod.PostInit
import net.minecraft.item.Item
import cpw.mods.fml.common.Mod.Instance
import stacksetter.common.proxy.CommonProxy
import cpw.mods.fml.common.SidedProxy
import cpw.mods.fml.common.Mod.PreInit
import cpw.mods.fml.common.event.FMLPreInitializationEvent
import cpw.mods.fml.common.event.FMLPostInitializationEvent

@Mod(modid = DefaultProps.ModID, name = DefaultProps.ModName, version = DefaultProps.Version)
@NetworkMod(clientSideRequired = false, serverSideRequired = false)
class StackSetter {

  @Instance(DefaultProps.ModID)
  var modInstance: StackSetter = null;

  @SidedProxy(clientSide = "stacksetter.common.proxy.ClientProxy", serverSide = "stacksetter.common.proxy.CommonProxy")
  var proxy: CommonProxy = null;

  @PreInit
  def preInit(event: FMLPreInitializationEvent) {
      
  }

  @PostInit
  def postInit(event: FMLPostInitializationEvent) {

  }
}