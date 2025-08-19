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

getTopRatings();