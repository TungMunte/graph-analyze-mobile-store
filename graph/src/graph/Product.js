import Plot from "react-plotly.js";
import { useEffect, useState } from "react";
import axios from "axios";

function Product() {
  const [product, setProduct] = useState([]);
  const [display, setDisplay] = useState([]);

  useEffect(() => {
    async function report() {
      const response = await axios.get("http://localhost:8080/api/top5product");
      console.log(response.data);
      setProduct(response.data);
      var listOfX = [];
      for (let i of product) {
        listOfX.push(`product ${i.productId}`);
      }
      var listOfPrice = [];
      for (let i of product) {
        listOfPrice.push(Number(i.price) / 100);
      }
      var listOfTotal = [];
      for (let i of product) {
        listOfTotal.push(Number(i.total) / 1000);
      }
      var listOfTotalAmount = [];
      for (let i of product) {
        listOfTotalAmount.push(i.totalAmount);
      }
      var data1 = {
        x: listOfX,
        y: listOfPrice,
        type: "bar",
        name: "Price",
      };
      var data2 = {
        x: listOfX,
        y: listOfTotal,
        type: "bar",
        name: "Total",
      };
      var data3 = {
        x: listOfX,
        y: listOfTotalAmount,
        type: "bar",
        name: "TotalAmount",
      };
      setDisplay([data1, data2, data3]);
    }
    report();
  }, []);

  return (
    <Plot
      data={display}
      layout={{ width: "200%", height: "200%", title: "Top 5 Product" }}
    />
  );
}

export default Product;
