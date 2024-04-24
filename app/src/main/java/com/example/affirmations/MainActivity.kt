package com.example.affirmations

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.affirmations.data.Datasource
import com.example.affirmations.model.Affirmation
import com.example.affirmations.ui.theme.AffirmationsTheme


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AffirmationsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AffirmationsApp()
                }
            }
        }
    }
}

@Composable
fun AffirmationsApp() {
    AffirmationList(
        affirmationList = Datasource().loadAffirmations(),
    )
}

@Composable
fun AffirmationList(affirmationList: List<Affirmation>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(affirmationList) { affirmation ->
            AffirmationCard(
                affirmation = affirmation,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}


@Composable
fun AffirmationCard(affirmation: Affirmation, modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .padding(0.dp)
            .animateContentSize()
            .fillMaxWidth()
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            ) {
                expanded = !expanded
            }

    )
    {
        Card(
            modifier = modifier
                .padding(0.dp)
                .background(Color(0xFF032B6B))) {
            Column(
                modifier = modifier
                    .padding(0.dp)
                    .background(Color(0xFF032B6B))
            ) {
                Text(
                    text = LocalContext.current.getString(affirmation.place),
                    modifier = Modifier.padding(10.dp),
                    style = MaterialTheme.typography.headlineLarge.copy(
                        fontWeight = FontWeight.Bold,
                        color = Color.Yellow  // Yellow text
                    )
                )

            // Add a divider line between title and description
            Divider(color = Color.Yellow, thickness = 1.dp, modifier = Modifier.padding(horizontal = 16.dp))

                Text(
                    text = LocalContext.current.getString(affirmation.placedesc),
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.headlineMedium.copy(
                        fontStyle = FontStyle.Italic,
                        color = Color.Yellow  // Yellow text
                    )
                )

                Image(
                    painter = painterResource(affirmation.image),
                    contentDescription = stringResource(affirmation.place),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(194.dp),
                    contentScale = ContentScale.Crop
                )
                if (expanded) {
                    Text(
                        text = LocalContext.current.getString(affirmation.placetext),
                        modifier = Modifier
                            .padding(16.dp),
                        style = MaterialTheme.typography.headlineSmall.copy(
                            color = Color.Yellow  // Yellow text
                        )
                    )
                }
        }
    }

    }
}

@Preview
@Composable
private fun AffirmationCardPreview() {
    AffirmationCard(Affirmation(R.string.affirmation1, R.string.affirmation1_desc, R.drawable.image1, R.string.affirmation1_text),)
}