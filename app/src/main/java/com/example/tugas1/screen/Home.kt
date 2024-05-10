package com.example.tugas1.screen

import android.content.ClipData.Item
import android.widget.ImageButton
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.layout.ContentScale
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.example.tugas1.controller.Screens
import androidx.compose.foundation.clickable

data class Content(
    val image:String,
    val title:String,
    val desc:String,
    val newdetail:String
){}

val contents = listOf(
    Content(image = "https://letsenhance.io/static/73136da51c245e80edc6ccfe44888a99/1015f/MainBefore.jpg",
        title = "Bunglon",
        desc = "Untuk Detail Click Gambar",
        newdetail = "Bunglon Adalah Hewan Yang Memiliki Kelebihan Bisa Berubah Warna"),

    Content(image = "https://images.unsplash.com/photo-1592670130429-fa412d400f50?q=80&w=1000&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8d2lsZCUyMGFuaW1hbHxlbnwwfHwwfHx8MA%3D%3D",
        title = "Gajah",
        desc = "Untuk Detail Click Gambar",
        newdetail = "Memiliki belalai panjang dan taring besar.. "),

    Content(image = "https://asset.kompas.com/crops/tkMmIaj1OiYlxUgX-KbD1CVzyHc=/0x0:4709x3139/1200x800/data/photo/2021/05/07/60956ee89fed2.jpg",
        title = "Kura-Kura",
        desc = "Untuk Detail Click Gambar",
        newdetail = "Reptil dengan cangkang keras dan gerakan lambat."),

    Content(image = "https://ichef.bbci.co.uk/ace/ws/640/cpsprodpb/1268F/production/_105870457_harimau01.jpg",
        title = "Harimau",
        desc = " Untuk Detail Click Gambar",
        newdetail = " Predator besar dengan belang hitam dan janggut.."),

    Content(image = "https://cdn.idntimes.com/content-images/community/2022/06/2-a338ebee7963a0de04272cb76e2b071d-8a8ffc79e7462d7fe36a8baa2382300f.jpg",
        title = "Kuda",
        desc = "Untuk Detail Click Gambar",
        newdetail = "Hewan herbivora berkaki empat dengan rambut panjang.. "),

    Content(image = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSBulEc44K-Fm-MDnV68IQfrX9CKImqWnbv-77gLDTYQg&s",
        title = "Kupu-kupu",
        desc = "Untuk Detail Click Gambar",
        newdetail = "Insektivora yang indah dengan sayap berwarna-warni."),

    Content(image = "https://asset-a.grid.id/crop/0x0:0x0/700x465/photo/nationalgeographic/201407221529090_b.jpg",
        title = "Kucing",
        desc = "Untuk Detail Click Gambar",
        newdetail = "Predator kecil dengan sikap fleksibel dan gemas."),

    Content(image = "https://asset-a.grid.id/crop/0x0:0x0/x/photo/2023/03/20/fakta-menarik-seputar-singa-laut-20230320121708.jpg",
        title = "Singa Laut",
        desc = "Untuk Detail Click Gambar",
        newdetail = "Mamalia laut dengan bulu halus dan kemampuan berenang yang baik. "),

    Content(image = "https://asset-a.grid.id//crop/0x0:0x0/360x240/photo/bobofoto/original/2158_singa.jpg",
        title = "Singa",
        desc = "Untuk Detail Click Gambar",
        newdetail = "Predator kuat dengan janggut dan bulu tebal."),

    Content(image = "https://asset.kompas.com/crops/M8tZZVU1-lgHxIPm1ZIF3m3pN7s=/0x0:1000x667/1200x800/data/photo/2017/09/16/2548005054.JPG",
        title = "Jerapah",
        desc = "Untuk Detail Click Gambar",
        newdetail = "Hewan herbivora dengan leher panjang dan kaki yang tinggi."),
)
@Composable
fun Home(navController: NavController) {
    val banner = listOf(
        Content(image = "https://cdn.idntimes.com/content-images/community/2023/10/bear-7636696-1280-3241d69518fb4418eb841c3d4dc24ca6-07fc57c17bc9e0bdc6384385b8c1d2c1_600x400.jpg", title = "Bung", desc = "lorem", newdetail = "aku bunglon"),
        Content(image = "https://cdn.timesmedia.co.id/images/2021/07/10/Beruang-Grizzly.jpg", title = "Bung", desc = "lorem", newdetail = "aku bunglon"),
        Content(image = "https://static.promediateknologi.id/crop/0x0:0x0/0x0/webp/photo/jawapos/2019/01/kejam-negara-ini-biarkan-beruang-grizzly-diburu_m_215133.jpeg", title = "Bung", desc = "lorem", newdetail = "aku bunglon"),
    )

    val menu = listOf("Popular","Animal")
    Column {

        LazyVerticalGrid(columns = GridCells.Adaptive(100.dp)) {
            items(menu){ item->
                Button(onClick = { /*TODO*/ }) {
                    Text(text = item.toString())
                }
            }
        }
        LazyRow(modifier= Modifier.padding(vertical = 50.dp)) {
            items(items = banner) { content ->
                Card(content) {
//                    navController.navigate("detail" + "/${content.newdetail}")

                }

            }
        }
        LazyColumn(modifier = Modifier.padding(vertical = 10.dp)) {
            items(contents) { content ->
                ContentItem(content = content, onClick = {
                    navController.navigate("detail/${content.newdetail}")

                })
            }
        }

    }
}



@Composable
fun Card (content:Content, onClick: () -> Unit){
    Row{
        Box(modifier =Modifier.widthIn(0.dp,150.dp) ){
            AsyncImage(model = content.image, contentDescription = content.title, )

        }
//                Column (Modifier.padding(start = 10.dp)){
//
//                Text(text = content.title)
//                Button(onClick = onClick) {
//                    Text(text = "See More..")
//                }
    }

}


@Composable
fun ContentItem(content: Content, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .padding(vertical = 8.dp, horizontal = 16.dp)
            .fillMaxWidth()
            .clickable(onClick = onClick)
    ) {
        Image(
            painter = rememberImagePainter(content.image),
            contentDescription = content.title,
            modifier = Modifier.size(100.dp),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .padding(start = 16.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = content.title,

                modifier = Modifier.fillMaxWidth()
            )
            Text(
                text = content.desc,

                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}