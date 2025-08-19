//
// Place any custom JS here
//

// run api request
async function getTopRatings() {
  const url = "http://localhost:8080/reviews/top-ratings";
  try {
    const response = await fetch(url);
    if (!response.ok) {
      throw new Error(`Response status: ${response.status}`);
    }

    const result = await response.json();
    console.log(result);

    let htmlList = '<ul class="list-group">';
    result.forEach(element => {
      htmlList += `
        <li class="list-group-item d-flex justify-content-between align-items-center">
          <span class="fw-bold">${element[1]}</span>
          <span class="badge bg-primary rounded-pill">${Math.round(element[2] * 10)/ 10}</span>
        </li>`;
    });
    htmlList += '</ul>';

    document.getElementById("top-movies").innerHTML = htmlList;
  } catch (error) {
    console.error(error.message);
  }
}


  async function getMovies() {
    const url = "http://localhost:8080/movies";
    try {
      const response = await fetch(url);
      if (!response.ok) {
        throw new Error(`Response status: ${response.status}`);
      }
  
      const result = await response.json();
      console.log(result);
      htmlList = "";
      result.forEach(element => {
        htmlList += "<tr><td>"+element.id+"</td><td>"+element.title+"</td><td>"+element.director;
      });
      document.getElementById("all-movies").innerHTML = "<table class=\"table\"><thead><tr><th>Id</th><th>Title</th><th>Director</th></tr></thead><tbody id=\"table\">"+htmlList+"</tbody></table>";
    } catch (error) {
      console.error(error.message);
    }
  }

function filterMovies(){
    console.log("abc")
    var value = document.getElementById("search-movie").value.toLowerCase();
    $("#table tr").filter(function() {
        console.log("xyz")
      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    });
}



async function getTopRatingsByGenre() {
  // Get the selected genre from the dropdown
  const genre = document.getElementById("genre").value;
  console.log(genre);
  const url = `http://localhost:8080/reviews/top-ratings/${genre}`;
  console.log(url);
  try {
    const response = await fetch(url);
    if (!response.ok) {
      throw new Error(`Response status: ${response.status}`);
    }

    const result = await response.json();
    console.log(result);

    let htmlList = "";
    result.forEach(element => {
      htmlList +=  `
      <li class="list-group-item d-flex justify-content-between align-items-center">
        <span class="fw-bold">${element[1]}</span></li>`; // Assumes element[1] contains the movie name
    });

    document.getElementById("top-genres").innerHTML = `<ol>${htmlList}</ol>`;
  } catch (error) {
    console.error(error.message);
    document.getElementById("top-genres").innerHTML = "<p>Error loading data. Please try again later.</p>";
  }
}

getTopRatings();
getTopRatingsByGenre();
getMovies();