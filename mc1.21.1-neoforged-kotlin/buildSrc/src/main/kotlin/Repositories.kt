import org.gradle.api.Project
import org.gradle.kotlin.dsl.repositories

fun Project.repositories() {
    repositories {
        mavenLocal()
        maven {
            name = "Kotlin for Forge"
            url = uri("https://thedarkcolour.github.io/KotlinForForge/")
            content {
                includeGroup("thedarkcolour")
            }
        }
        maven {
            name = "DevOS Public Maven"
            url = uri("https://mvn.devos.one/snapshots")
            content {
                includeGroup("com.tterrag.registrate")
            }
        }
        maven {
            name = "Create Mod Maven"
            url = uri("https://maven.createmod.net")
            content {
                includeGroup("com.simibubi.create")
                includeGroup("net.createmod.ponder")
                includeGroup("dev.engine-room.flywheel")
            }
        }
        maven {
            name = "Blamejared Maven"
            url = uri("https://maven.blamejared.com/")
            content {
                includeGroup("mezz.jei")
            }
        }
    }
}