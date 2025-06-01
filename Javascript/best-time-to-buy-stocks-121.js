// Purchase price
// Keep track of profit
  // Go through the array and see if if there is profit
    // if there is no profit continue
    // if there is profit 
      // check if my current purchase price is less than my old one
        // replace my starting price
      // track profit
        // computed price > profit
          // track it
        
// return profit


function maxProfit(prices) {
    let buyPrice = prices[i];
    let profit = 0;

    for(let i = 0; i < prices.length-1; i++) {
        let tempProfit = prices[i+1] - prices[i];
        if(tempProfit > 0) {
            if(prices[i] < buyPrice) {
                buyPrice = prices[i]
            }
            if(prices[i+1] - buyPrice > profit) {
                profit = prices[i+1] - buyPrice;
            }
        }
    }
    return profit;
}

console.log(maxProfit([7,1,5,3,6,4]));