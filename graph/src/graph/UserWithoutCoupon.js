import Plot from "react-plotly.js";
import { useEffect, useState } from "react";
import axios from "axios";

function UserWithoutCoupon() {
  const [product, setProduct] = useState([]);
  const [display, setDisplay] = useState();

  useEffect(() => {
    async function report() {
      const response = await axios.get(
        "http://localhost:8080/api/top5userWithoutCoupon"
      );
      console.log(response.data);
      setProduct(response.data);
      var listOfX = [];
      for (let i of product) {
        listOfX.push(`user ${i.userId}`);
      }
      var listOfPrice = [];
      for (let i of product) {
        listOfPrice.push(Number(i.total));
      }
      var data1 = {
        x: listOfX,
        y: listOfPrice,
        type: "bar",
        name: "Price",
      };

      setDisplay(data1);
    }
    report();
  }, []);

  return (
    <Plot
      data={[display]}
      layout={{
        width: "200%",
        height: "200%",
        title: "Top 5 User with coupon",
      }}
    />
  );
}

export default UserWithoutCoupon;
