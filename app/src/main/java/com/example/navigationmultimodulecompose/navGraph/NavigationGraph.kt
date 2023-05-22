import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.featureone.Presentation.Screen.FeatureOneScreen
import com.example.featuretree.FeatureThreeScreen
import com.example.featuretwo.Presentation.Screen.FeatureTwoScreen


@Composable
fun NavigationGraph(
    navController: NavHostController,
    startLocation: String
) {

    NavHost(
        navController = navController,
        startDestination = startLocation
    ) {
        composable(
            route = NavigationItem.FeatureOneScreenItem.route
        ) {
            FeatureOneScreen(
                navigateTo = {
                    navController.navigate(it)
                }
            )
        }

        composable(
            route = NavigationItem.FeatureTwoScreenItem.route
        ) {
            FeatureTwoScreen(navigateTo = {
                navController.navigate(it)
            })
        }

        composable(
            route = NavigationItem.FeatureThreeScreenItem.route
        ) {
            FeatureThreeScreen(navigateTo = {
                navController.navigate(it)
            })
        }

    }
}
