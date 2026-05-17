import org.gradle.api.Project
import kotlin.reflect.KProperty

// Environment Properties
val Project.mcVersion: String by Delegate()
val Project.mcVersionRange: String by Delegate()
val Project.neoforgedVersion: String by Delegate()
val Project.neoforgedVersionRange: String by Delegate()
val Project.parchmentVersion: String by Delegate()
val Project.parchmentMcVersion: String by Delegate()
val Project.modLoaderVersionRange: String by Delegate()

// Mod Properties
val Project.modId: String by Delegate()
val Project.modName: String by Delegate()
val Project.modGroup: String by Delegate()
val Project.modVersion: String by Delegate()
val Project.modAuthors: String by Delegate()
val Project.modLicense: String by Delegate()
val Project.modDescription: String by Delegate()
val Project.modCredits: String by Delegate()

class Delegate {

    operator fun getValue(thisRef: Project, property: KProperty<*>): String
            = thisRef.findProperty(property.name).toString()

}