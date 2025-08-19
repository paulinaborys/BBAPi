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
      htmlList = "";
      result.forEach(element => {
        htmlList += "<li>"+element[1];
      });
      document.getElementById("top-movies").innerHTML = "<ol>"+htmlList+"</ol>";
    } catch (error) {
      console.error(error.message);
    }
  }



async function getTopRatingsByGenre() {
  // Get the selected genre from the dropdown
  const genre = document.getElementById("genre").value;
  console.log(genre);
  const url = `http://localhost:8080/top-ratings/${genre}`;
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
      htmlList += `<li>${element[1]}</li>`; // Assumes element[1] contains the movie name
    });

    document.getElementById("top-genres").innerHTML = `<ol>${htmlList}</ol>`;
  } catch (error) {
    console.error(error.message);
    document.getElementById("top-genres").innerHTML = "<p>Error loading data. Please try again later.</p>";
  }
}

getTopRatings();
getTopRatingsByGenre();