sealed class NavigationItem(
    val route: String,
    val title: String,
    val navBack: String = ""
) {
    object FeatureOneScreenItem : NavigationItem(
        route = "feature_one_screen",
        title = "FeatureOneScreen"
    )

    object FeatureTwoScreenItem : NavigationItem(
        "feature_two_screen",
        title = "FeatureTwoScreen"
    )

    object FeatureThreeScreenItem : NavigationItem(
        "feature_tree_screen",
        title = "FeatureThreeScreen"
    )


    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}