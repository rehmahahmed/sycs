using System.Collections;
using System.Collections.Generic;
using UnityEngine;
public class animate : MonoBehaviour
  {
    public float speed;
    Rigidbody2D rb2d;
    // Start is called before the first frame update
    void Start()
      {
        rb2d = GetComponent<Rigidbody2D>();
      }
      // Update is called once per frame
    void FixedUpdate()
    {
      float moveHorizontal = Input.GetAxis("Horizontal");
      float moveVertical = Input.GetAxis("Vertical");
      var movement = new Vector2(moveHorizontal, moveVertical).normalized * speed * Time.deltaTime;
      rb2d.AddForce(movement);
    }
}
