module org.gradle.fairy.tale.pigs {
    requires org.gradle.actors;
    requires transitive org.gradle.fairy.tale;
    requires org.gradle.fairy.tale.formula;

    provides org.gradle.fairy.tale.Tale
            with org.gradle.fairy.tale.pigs.ThreeLittlePigs;
}
