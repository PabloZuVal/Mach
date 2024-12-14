package com.marcantonyc.mach.ui.composable

import androidx.compose.ui.draw.clip

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.marcantonyc.mach.R

data class Person(
    val imageResId: Int,
    val name: String,
    val description: String
)

@Composable
fun PersonList(persons: List<Person>) {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
            .padding(16.dp),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(persons.size) { index ->
            PersonItem(person = persons[index])
        }
    }
}

@Composable
fun PersonItem(person: Person) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text("IMAGEN")

        Column {
            Text(
                text = person.name,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = person.description,
                fontSize = 14.sp,
                color = Color.Gray
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MuestrameLaWea() {

    val sampleData = listOf(
        Person(imageResId = 1, name = "John Pablo", description = "Photographer"),
        Person(imageResId = 1, name = "Jane Smith", description = "Designer"),
        Person(imageResId = 1, name = "Bob Johnson", description = "Developer")
    )

    PersonList(persons = sampleData)
}

